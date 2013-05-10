package com.example.gridlayout;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.GridLayout.Spec;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		Point size = new Point();
		getWindowManager().getDefaultDisplay().getSize(size);
		int screenWidth = size.x;
		int screenHeight = size.y;
		Log.i("Alex","screenWidth = " + screenWidth + " screenHeight = " +screenHeight);
		
		int halfScreenWidth = (int)(screenWidth / 3);
		int quarterScreenWidth = (int)(halfScreenWidth/2);
		
		int halfScreenHeight = (int)(screenHeight / 3);
		int quarterScreenHeight = (int)(halfScreenHeight/2);

		Spec row1 = GridLayout.spec(0);
		Spec row2 = GridLayout.spec(1);
		Spec row3 = GridLayout.spec(2);
		Spec row4 = GridLayout.spec(3);

		Spec col0 = GridLayout.spec(0);
		Spec col1 = GridLayout.spec(1); 
		Spec colspan2 = GridLayout.spec(0,4);

		GridLayout gridLayout = new GridLayout(this);
		gridLayout.setColumnCount(4);
		gridLayout.setRowCount(4);

		TextView twoByTwo1 = new TextView(this);
		GridLayout.LayoutParams first = new GridLayout.LayoutParams(row1, colspan2);
		first.width = screenWidth;
		first.height = halfScreenHeight;
		twoByTwo1.setLayoutParams(first);
		twoByTwo1.setGravity(Gravity.CENTER);
		twoByTwo1.setBackgroundColor(Color.RED);
		twoByTwo1.setText("TOP");
		twoByTwo1.setTextAppearance(this, android.R.style.TextAppearance_Large);
		gridLayout.addView(twoByTwo1, first);

		TextView twoByOne1 = new TextView(this);
		GridLayout.LayoutParams second = new GridLayout.LayoutParams(row2, GridLayout.spec(0,3));
		second.width = (int) (screenWidth*0.75);
		second.height = quarterScreenHeight;
		twoByOne1.setLayoutParams(second);
		twoByOne1.setBackgroundColor(Color.BLUE);
		twoByOne1.setText("Staff Choices");
		twoByOne1.setTextAppearance(this, android.R.style.TextAppearance_Large);
		gridLayout.addView(twoByOne1, second);

		TextView twoByOne2 = new TextView(this);
		GridLayout.LayoutParams third = new GridLayout.LayoutParams(row2, GridLayout.spec(3));
		third.width = (int) (screenWidth*0.25);
		third.height = quarterScreenHeight;
		twoByOne2.setLayoutParams(third);
		twoByOne2.setBackgroundColor(Color.GREEN);
		twoByOne2.setText("Games");
		twoByOne2.setTextAppearance(this, android.R.style.TextAppearance_Large);
		gridLayout.addView(twoByOne2, third);

		TextView twoByOne3 = new TextView(this);
		GridLayout.LayoutParams fourth = new GridLayout.LayoutParams(row3, GridLayout.spec(0,1));
		fourth.width = (int) (screenWidth*0.25);
		fourth.height = quarterScreenHeight;
		twoByOne3.setLayoutParams(fourth);
		twoByOne3.setBackgroundColor(Color.YELLOW);
		twoByOne3.setText("Editor's Choices");
		twoByOne3.setTextAppearance(this, android.R.style.TextAppearance_Large_Inverse);
		gridLayout.addView(twoByOne3, fourth);

		TextView twoByOne4 = new TextView(this);
		GridLayout.LayoutParams fifth = new GridLayout.LayoutParams(row3, GridLayout.spec(1,3));
		fifth.width = (int) (screenWidth*0.75);
		fifth.height = quarterScreenHeight;
		twoByOne4.setLayoutParams(fifth);
		twoByOne4.setBackgroundColor(Color.MAGENTA);
		twoByOne4.setText("Something Else");
		twoByOne4.setTextAppearance(this, android.R.style.TextAppearance_Large);
		gridLayout.addView(twoByOne4, fifth);

		TextView twoByTwo2 = new TextView(this);
		GridLayout.LayoutParams sixth = new GridLayout.LayoutParams(row4, colspan2);
		sixth.width = screenWidth;
		sixth.height = halfScreenHeight;
		twoByTwo2.setLayoutParams(sixth);
		twoByTwo2.setGravity(Gravity.CENTER);
		twoByTwo2.setBackgroundColor(Color.CYAN);
		twoByTwo2.setTextColor(Color.BLACK);
		twoByTwo2.setText("BOTTOM");
		twoByTwo2.setTextAppearance(this, android.R.style.TextAppearance_Large_Inverse);
		gridLayout.addView(twoByTwo2, sixth);
		
		setContentView(gridLayout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
