package com.example.quadraticequation;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticequation.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    String a,b,c;

    ActivityMainBinding binding;
    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public MyEquation() {
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void solveEquation(View view){
        int a=Integer.parseInt(getA());
        int b= Integer.parseInt((getB()));
        int c= Integer.parseInt((getC()));

        double d=b*b-4*a*c;
        double x1,x2;
        if (d>0)
        {
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            binding.txtview.setText("X1= "+x1+" X2= "+x2);
        }
        else if(d==0)
        {
            x1=-b/2*a;
            x2=-b/2*a;
            binding.txtview.setText("X1= "+x1+" X2= "+x2);
        }
        else {
            binding.txtview.setText("No real solution");

        }
    }
}
