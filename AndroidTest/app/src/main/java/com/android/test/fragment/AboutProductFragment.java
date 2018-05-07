package com.android.test.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.test.R;
import com.android.test.ScreenSlidePagerActivity;
import com.android.test.model.CollectionParse;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AboutProductFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutProductFragment extends Fragment {
    public static String TAG = AboutProductFragment.class.getName();

    private CollectionParse mCollectionParse;

    public AboutProductFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static AboutProductFragment newInstance(CollectionParse collectionParse) {
        AboutProductFragment fragment = new AboutProductFragment();
        Bundle args = new Bundle();
        args.putParcelable("collectionParse", collectionParse);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mCollectionParse = getArguments().getParcelable("collectionParse");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup)  inflater.inflate(R.layout.fragment_about_product, container, false);

        TextView info = (TextView) rootView.findViewById(R.id.info);
        info.setText("Product Name:\t" + mCollectionParse.getIncluded().get(2).getAttributes().getName()+
                "\nPrice:\t" + mCollectionParse.getIncluded().get(2).getAttributes().getPrice() +
                "\nBalance Data:\t" + mCollectionParse.getIncluded().get(1).getAttributes().getIncludedDataBalance()+
                "\nDate of Expiry:\t" + mCollectionParse.getIncluded().get(1).getAttributes().getExpiryDate());

        return rootView;
    }

}
