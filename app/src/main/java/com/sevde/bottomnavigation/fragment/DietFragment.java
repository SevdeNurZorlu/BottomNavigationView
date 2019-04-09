package com.sevde.bottomnavigation.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.sevde.bottomnavigation.R;
import com.sevde.bottomnavigation.adapters.CustomDietAdapter;
import com.sevde.bottomnavigation.models.DietModel;

import java.util.ArrayList;
import java.util.List;


public class DietFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    List<DietModel>dietModelList= new ArrayList<DietModel>();



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DietFragment() {
        // Required empty public constructor
    }



    public static DietFragment newInstance(String param1, String param2) {
        DietFragment fragment = new DietFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_diet,container,false);
        ListView dietListView=(ListView)view.findViewById(R.id.diet_list);

        dietModelList.add(new DietModel(R.drawable.egg,"Peynir,Zeytin,Yumurta","200C"));
        dietModelList.add(new DietModel(R.drawable.meyve,"Elma,Armut,Nar","500C"));
        dietModelList.add(new DietModel(R.drawable.burger,"Burger,Patates,Kola","2500C"));
        dietModelList.add(new DietModel(R.drawable.kebab,"Kebab,Ciger,kuşbaşı","2000C"));
        dietModelList.add(new DietModel(R.drawable.ice,"Çikolata,Dondurma,Cips","2500C"));
        dietModelList.add(new DietModel(R.drawable.cook,"Börek,Kurabiye,Turta","3500C"));


        CustomDietAdapter customDietAdapter=new CustomDietAdapter(getLayoutInflater(),dietModelList);
        dietListView.setAdapter(customDietAdapter);



        // Inflate the layout for this fragment
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
