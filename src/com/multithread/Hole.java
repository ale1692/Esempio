package com.multithread;

import java.util.concurrent.locks.ReentrantLock;

public class Hole extends ReentrantLock {
	private boolean empty = true;

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

}
