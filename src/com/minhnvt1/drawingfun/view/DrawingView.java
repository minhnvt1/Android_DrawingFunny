package com.minhnvt1.drawingfun.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class DrawingView extends View {

	public DrawingView(Context context) {
		super(context);

	}

	public DrawingView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setupDrawing();
	}

	private void setupDrawing() {
		// get drawing area setup for interaction
	}
}
