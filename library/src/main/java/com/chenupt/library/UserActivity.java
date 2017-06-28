package com.chenupt.library;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by chenupt on 2017/6/28.
 */

public class UserActivity extends AppCompatActivity {

	public static void startActivity(Context context) {
		Intent intent = new Intent(context, UserActivity.class);
		context.startActivity(intent);
	}

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user);
	}
}
