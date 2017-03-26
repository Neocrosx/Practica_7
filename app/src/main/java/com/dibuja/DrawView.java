package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);

		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);
		
		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);


        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);
        //Octagono con drawLine
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(4);
		canvas.drawLine(100,180,100,230, paint);
		canvas.drawLine(100,180,135,145,paint);
		canvas.drawLine(135,145,185,145,paint);
		canvas.drawLine(185,145,220,180,paint);
		canvas.drawLine(220,180,220,230,paint);
		canvas.drawLine(220,230,185,265,paint);
		canvas.drawLine(185,265,135,265,paint);
		canvas.drawLine(135,265,100,230,paint);
		//Estrella con drawLine
		paint.setColor(Color.MAGENTA);
		canvas.drawLine(300,223,350,223,paint);
		canvas.drawLine(350,223,375,180,paint);
		canvas.drawLine(375,180,400,223,paint);
		canvas.drawLine(400,223,450,223,paint);
		canvas.drawLine(450,223,400,266,paint);
		canvas.drawLine(400,266,450,334,paint);
		canvas.drawLine(450,334,375,291,paint);
		canvas.drawLine(375,291,300,334,paint);
		canvas.drawLine(300,334,350,266,paint);
		canvas.drawLine(350,266,300,223,paint);
		//Agujero de gusano con path
		Path agujeroIzq= new Path();
		agujeroIzq.addCircle(300, 450, 45, Path.Direction.CCW);
		paint.setColor(Color.BLACK);
		paint.setStrokeWidth(5);
		paint.setStyle(Paint.Style.FILL_AND_STROKE);
		canvas.drawPath(agujeroIzq, paint);

		Path agujeroDere = new Path();
		agujeroDere.addCircle(500, 450, 45, Path.Direction.CCW);
		canvas.drawPath(agujeroDere,paint);

		Path lineaInfer = new Path();
		lineaInfer.addArc(new RectF(320, 465, 480, 515), -180, 180);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawPath(lineaInfer, paint);

		Path lineaSuper = new Path();
		lineaSuper.addArc(new RectF(320, 385, 480, 435), 180,- 180);
		canvas.drawPath(lineaSuper, paint);

		paint.setStrokeWidth(1);
		paint.setStyle(Paint.Style.FILL);
		paint.setTextSize(13);
		canvas.drawTextOnPath("López León Christian 6IM7", lineaSuper, 10,-20, paint);

	}

}
