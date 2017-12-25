package net.nrask.voidlockscreen.ui.lockscreen.unlockers;

import android.widget.RelativeLayout;

import net.nrask.voidlockscreen.ui.LockscreenActivity;

/**
 * Created by Sebastian Rask on 20-12-2016.
 */

public abstract class LockscreenUnlocker extends MotionListener {

	public LockscreenUnlocker(RelativeLayout lockscreenContainer, LockscreenActivity context) {
		super(lockscreenContainer, context);
	}

	protected void unlock() {
		if (activity != null) {
			activity.unlock();
		}
	}

	public void unlockNoTouch() {
		unlock();
	}
}