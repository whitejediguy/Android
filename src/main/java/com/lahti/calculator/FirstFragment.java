package com.lahti.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import java.util.Map;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.text.TextWatcher;
import androidx.navigation.fragment.NavHostFragment;

import com.lahti.calculator.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

//    private ArrayList<Integer> calculateNumbers = new ArrayList<Integer>();
//    private ArrayList<Character> calculateOperator = new ArrayList<Character>();
//    private ArrayList<String> cText = new ArrayList<String>();
//    private char previousCharacter = 'a';
    private int num = 0;
    private int pNum = 0;
    private int op = 0;
    History history = new History();

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        binding.volumeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                pNum = num;
//                num = 0;
//                op = 1; //addition
//////                CharSequence cText  = binding.calculatedText.getText();
//////                calculateOperator.add('+');
//////                calculateNumbers.add(Integer.parseInt(cText.toString()));
//////                binding.calculateArchive.append(cText.toString());
//////                binding.calculatedText.getText().clear();
////                binding.calculatedText.append("+");
////                binding.calculateArchive.setText(Integer.valueOf(cText.get(cText.size()-1))+);
////                cText.add("+");
//////                binding.calculateArchive.append("+");
//            }
//        });


//        //=
//        binding.equalsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int calculated = calculateNumbers.get(0);
//
//                for(int i = 0; i < calculateNumbers.size(); i++ ){
//                    if(i < calculateOperator.size()){
//                        if(calculateOperator.get(i) == '+')
//                            calculated = calculated + calculateNumbers.get(i);
//                        else if(calculateOperator.get(i) == '-')
//                            calculated = calculated - calculateNumbers.get(i);
//
//                    }
//                }
//                binding.calculateArchive.setText("");
//                binding.calculateArchive.append(Integer.toString(calculated));
//
//            }
//        });

        //1
        binding.areaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.calculated.setText("");
//                binding.calculated.setText( Integer.parseInt(binding.calculatedText1.getText().toString()) + Integer.parseInt(binding.calculatedText2.getText().toString()) );
                double total = (Double.parseDouble(binding.diameter.getText().toString()) / 2);
                total = (total * total) * 3.14;
                binding.calculated.setText(String.valueOf(total));
//                History history = new History(true,total);
                history.addItem(true,total);

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
//                }
            }
        });

        binding.volumeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.calculated.setText("");
//                binding.calculated.setText( Integer.parseInt(binding.calculatedText1.getText().toString()) + Integer.parseInt(binding.calculatedText2.getText().toString()) );
                double total = (Double.parseDouble(binding.diameter.getText().toString()) / 2);
                total = 2  * 3.14 * total;
                binding.calculated.setText(String.valueOf(total));
//                History history = new History(false,total);
                history.addItem(false,total);
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

        super.onViewCreated(view, savedInstanceState);

        binding.historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_Main_to_History);
            }
        });


//        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
    }

//    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
//
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}