package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }
    @Override
    protected void onDraw (Canvas canvas){
        /// Отрисовка Травы
        Paint paint = new Paint();
        int px =360;
        int py =550;

        paint.setColor(Color.parseColor("#FF0A5F38"));
        //paint.setColor(0x7f0000ff);
        Rect trava = new Rect(0,getHeight()-200,getWidth(),getHeight());
        canvas.drawRect(trava,paint);
        /// Отрисовка Дома

        canvas.rotate(45,px,py);
        paint.setColor(Color.parseColor("#FF800000"));
        Rect roof = new Rect(150,getHeight()-550,500,getHeight()-200);
        canvas.drawRect(roof,paint);
        canvas.rotate(-45,px,py);

        paint.setColor(Color.parseColor("#FF654321"));
        Rect dom = new Rect(170,getHeight()-400,610,getHeight()-70);
        canvas.drawRect(dom,paint);

        paint.setColor(Color.BLACK);
        canvas.drawLine(170,getHeight()-400,610,getHeight()-400,paint);
        canvas.drawLine(170,getHeight()-400,170,getHeight()-70,paint);
        canvas.drawLine(170,getHeight()-70,610,getHeight()-70,paint);
        canvas.drawLine(610,getHeight()-400,610,getHeight()-70,paint);

        paint.setColor(Color.parseColor("#FFFFb340"));
        Rect window = new Rect(200,getHeight()-330,360,getHeight()-150);
        canvas.drawRect(window,paint);

        paint.setColor(Color.parseColor("#FF061e52"));
        Rect door = new Rect(400,getHeight()-380,570,getHeight()-90);
        canvas.drawRect(door,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(390,getHeight()-510,50,paint);

        /// Отрисовка Дерева
        paint.setColor(Color.parseColor("#FF654321"));
        Rect tree = new Rect(810,getHeight()-200,850,getHeight()-50);
        canvas.drawRect(tree,paint);
        paint.setColor(Color.GREEN);
        canvas.drawOval(680,getHeight()-800,980,getHeight()-120,paint);

        ///Отрисовка Скамейки
        paint.setColor(Color.GRAY);
        canvas.drawRect(1440,getHeight()-300,1500,getHeight()-100,paint);
        canvas.drawRect(1360,getHeight()-300,2150,getHeight()-250,paint);
        canvas.drawRect(2010,getHeight()-300,2070,getHeight()-100,paint);
        // Отрисовка решётки на окне
        int a;
        paint.setColor(Color.BLACK);
        for (a = 200; a<=360; a+=15){
            canvas.drawLine(a+5,getHeight()-330,a+5,getHeight()-150,paint);
            System.out.println(a);
        }
        for (a = getHeight()-325; a<=getHeight()-155; a+=15){
            canvas.drawLine(200,a+5,360,a+5,paint);
            System.out.println(a);
        }
        //Отрисовка солнца

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(70,70,100,paint);









        ///paint.setColor(Color.RED);// цвет пера
        ///paint.setAntiAlias(true); // сглаживание
        ///paint.setStrokeWidth(10);
        ///int y = getHeight()/2;
        ///int x = getWidth()/2;
        ///canvas.drawColor(Color.BLUE);
        ///canvas.drawCircle(x,y,150,paint);

        ///canvas.drawLine(50,20,100,100,paint);
        ///Rect rect1 = new Rect(200,500,20,100);
        ///canvas.drawRect(rect1,paint);
    }
}
