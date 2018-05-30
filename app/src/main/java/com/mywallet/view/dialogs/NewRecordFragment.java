package com.mywallet.view.dialogs;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mywallet.R;
import com.mywallet.mvp.dialogs.NewRecordMVP;
import com.mywallet.presenter.dialogs.NewRecordFragmentPresenter;

import java.util.Date;

/**
 * Created by oborovec on 08/03/2018.
 */

public class NewRecordFragment extends DialogFragment implements NewRecordMVP.View{

    private LinearLayout content;

    private LinearLayout incomeBtn;
    private LinearLayout expenseBtn;

    private TextView dateLbl;

    private TextView signLbl;
    private TextView amount;
    private TextView currencyLbl;

    private Button cancelBtn;
    private Button addmoreBtn;
    private Button saveBtn;

    private NewRecordMVP.Presenter presenter;

    private boolean positiveFocus = false;


    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.presenter = new NewRecordFragmentPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View fragmentView =  inflater.inflate(R.layout.dialog_new_record, container, false);
        this.setCancelable(false);

        this.content = fragmentView.findViewById(R.id.dialog_new_record_content);

        this.incomeBtn = fragmentView.findViewById(R.id.dialog_new_record_income_btn);
        this.expenseBtn = fragmentView.findViewById(R.id.dialog_new_record_expense_btn);

        this.dateLbl = fragmentView.findViewById(R.id.dialog_new_record_date);

        this.signLbl = fragmentView.findViewById(R.id.dialog_new_record_sign_label);
        this.amount = fragmentView.findViewById(R.id.dialog_new_record_amount_number);
        this.currencyLbl = fragmentView.findViewById(R.id.dialog_new_record_currency_label);

        this.cancelBtn = fragmentView.findViewById(R.id.dialog_new_record_cancle_btn);
        this.addmoreBtn = fragmentView.findViewById(R.id.dialog_new_record_another_btn);
        this.saveBtn = fragmentView.findViewById(R.id.dialog_new_record_save_btn);

        this.incomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setAsIncome();
                positiveFocus = true;
            }
        });
        this.expenseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setAsExpense();
                positiveFocus = false;
            }
        });
        this.cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewRecordFragment.this.dismiss();
            }
        });
        this.addmoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.saveRecordAndNew(getAmount(), getCurrencyLbl());
            }
        });
        this.saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.saveRecord(getAmount(), getCurrencyLbl());
            }
        });

        if (this.positiveFocus) {
            setAsIncome();
        } else {
            setAsExpense();
        }
        return fragmentView;
    }

    private void shakeFrame() {
        Animation shake = AnimationUtils.loadAnimation(getActivity(), R.anim.shake);
        shake.setRepeatCount(5);
        content.startAnimation(shake);
    }

    private void setAsIncome() {
        this.expenseBtn.setBackgroundColor(getActivity().getResources().getColor(R.color.neutralGrey));
        this.incomeBtn.setBackgroundColor(getActivity().getResources().getColor(R.color.incomeGreen));
        this.signLbl.setText("+");
    }
    private void setAsExpense() {
        this.incomeBtn.setBackgroundColor(getActivity().getResources().getColor(R.color.neutralGrey));
        this.expenseBtn.setBackgroundColor(getActivity().getResources().getColor(R.color.expenseRed));
        this.signLbl.setText("-");
    }

    @Override
    public void showInvalidInputNotification(String str) {
        Toast.makeText(getActivity(), "There is a problem with your inputs...",
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void dismissFrame() {
        super.dismiss();
    }

    public void setPositiveFocus(boolean positiveFocus) {
        this.positiveFocus = positiveFocus;
    }

    private float getAmount() {
        float inputNumber = Float.valueOf(this.amount.getText().toString());
        if (this.positiveFocus) {
            return inputNumber;
        } else {
            return -inputNumber;
        }
    }

    private String getCurrencyLbl() {
        return this.currencyLbl.getText().toString();
    }

    @Override
    public void setCurrencyLabel(String label) {
        this.currencyLbl.setText(label);
    }
}
