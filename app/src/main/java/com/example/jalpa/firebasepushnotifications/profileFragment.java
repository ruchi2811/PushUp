package com.example.jalpa.firebasepushnotifications;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import static com.example.jalpa.firebasepushnotifications.R.id.logout_btn;


/**
 * A simple {@link Fragment} subclass.
 */
public class profileFragment extends Fragment {
    private Button mLogoutBtn;
    private FirebaseAuth mAuth;


    public profileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        mAuth = FirebaseAuth.getInstance();
        mLogoutBtn = (Button) view.findViewById(R.id.logout_btn);
        mLogoutBtn.setOnClickListener(new View.OnClickListener(){
                                          @Override
                                          public void onClick(View v) {
                                              mAuth.signOut();
                                              Intent loginIntent = new Intent(getContext(), LoginActivity.class);
                                              startActivity(loginIntent);
                                          }
                                      }
        );
        return view;
    }

}
