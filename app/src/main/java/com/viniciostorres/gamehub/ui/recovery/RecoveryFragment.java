package com.viniciostorres.gamehub.ui.recovery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.viniciostorres.gamehub.R;
import com.viniciostorres.gamehub.databinding.FragmentRecoveryBinding;

public class RecoveryFragment extends Fragment {

    private FragmentRecoveryBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentRecoveryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.backFromRecovery.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_recoveryFragment_to_loginFragment);
        });
    }
}
