package com.stephen.pathfindercs;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SkillScreen.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SkillScreen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SkillScreen extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private  int pageNum;
    private  String Title;

    private OnFragmentInteractionListener mListener;

    // TODO: Rename and change types and number of parameters
    public static SkillScreen newInstance(int pageNum, String Title) {
        SkillScreen fragment = new SkillScreen();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, pageNum);
        args.putString(ARG_PARAM2, Title);
        fragment.setArguments(args);
        return fragment;
    }

    public SkillScreen() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            pageNum = getArguments().getInt(ARG_PARAM1);
            Title = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_skill_screen, container, false);
        ArrayAdapter<String> SkillAdapter = new ArrayAdapter<String>(getContext(),R.layout.skillbar,R.id.txtSkill, getResources().getStringArray(R.array.arrSkills));
        ListView temp = (ListView)view.findViewById(R.id.lstvwSkills);
        temp.setAdapter(SkillAdapter);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
