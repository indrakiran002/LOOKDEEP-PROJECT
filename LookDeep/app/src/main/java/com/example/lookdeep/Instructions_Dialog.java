package com.example.lookdeep;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Instructions_Dialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Instructions:")
                .setMessage("1) This App Has Different Interesting Levels To Play.\n2)There Will Be Some Questions In Each Level.\n3) You Need To Answer By Just Clicking On The Answer.\n4) It May Be Just An Image Or A Button.\n5) Think Carefully Before Answering.\n6) You Can Use Hints By Clicking On The Image At Top Right Corner.\n7) You Can Choose The Level Of Your Favourite Number(You Are Free To Choose Any Level).\nThank You And Happy Playing :)")

                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        return builder.create();

    }


}

