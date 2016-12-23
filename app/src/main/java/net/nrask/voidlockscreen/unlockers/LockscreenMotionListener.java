package net.nrask.voidlockscreen.unlockers;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import net.nrask.voidlockscreen.helpers.SRJHelper;

/**
 * Created by Sebastian Rask Jepsen (SRJ@Idealdev.dk) on 23/12/16.
 */

public abstract class LockscreenMotionListener {
	protected RelativeLayout lockscreenContainer;
	protected Activity context;

	public LockscreenMotionListener(RelativeLayout lockscreenContainer, Activity context) {
		this.lockscreenContainer = lockscreenContainer;
		this.context = context;
	}

	public abstract void onUserTouchDown(MotionEvent motionEvent);

	public abstract void onUserTouchUp(MotionEvent motionEvent);

	public abstract void onUserTouchMove(MotionEvent motionEvent);

	public abstract void onDismissViews();

	protected void setViewPosition(View view, int x, int y, boolean centerInPosition) {
		ViewGroup.LayoutParams oldParams = view.getLayoutParams();
		RelativeLayout.LayoutParams newParams = new RelativeLayout.LayoutParams(0, 0);
		newParams.leftMargin = x;
		newParams.topMargin = y;
		newParams.width = oldParams.width;
		newParams.height = oldParams.height;

		if (centerInPosition) {
			newParams.leftMargin = newParams.leftMargin - newParams.width / 2;
			newParams.topMargin = newParams.topMargin - newParams.height / 2;
		}

		view.setLayoutParams(newParams);
	}

	protected void setViewSize(View view, int height, int width) {
		RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
		params.height = height;
		params.width = width;

		view.setLayoutParams(params);
	}
}
