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
import com.android.test.model.Included;

public class ScreenSlidePageFragment extends Fragment {
    public static String TAG = ScreenSlidePagerActivity.class.getName();
    private CollectionParse mCollectionParse;

    public static ScreenSlidePageFragment newInstance(CollectionParse collectionParse) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
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
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);
        TextView info = (TextView) rootView.findViewById(R.id.info);

        info.setText("PaymentType:\t" + mCollectionParse.getData().getAttributes().getPaymentType()+"\nName:\t"+mCollectionParse.getData().getAttributes().getFirstName() + " " + mCollectionParse.getData().getAttributes().getLastName()
        + "\nDoB:\t"+mCollectionParse.getData().getAttributes().getDateOfBirth() + "\nContactNo:\t"+mCollectionParse.getData().getAttributes().getContactNumber() + "\nEmail:\t"+mCollectionParse.getData().getAttributes().getEmailAddress());
        return rootView;
    }
}