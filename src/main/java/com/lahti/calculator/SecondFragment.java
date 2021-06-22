package com.lahti.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.lahti.calculator.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_History_to_Main);
            }
        });

        binding.refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.historyView.setText(History.toStringT());
//                cText.add("1");
//                binding.diameter.append("1");

//                if(binding.calculatedText.getText().equals(0)){
//                    binding.calculatedText.setText("1");
//                    cText.add("1");
//                }else{
//                    binding.calculatedText.append("1");
//                    if(cText.size() > 0)
//                        cText.set(cText.size()-1, cText.get(cText.size()-1)+"1");
//                    else
//                        cText.set(0, "1");
//
            }

        });


    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
