package edu.rosehulman.fisherds.hellobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private int mCount = 0;
  private TextView mTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTextView = findViewById(R.id.message_text_view);
//    mTextView.setText("This is just a test");
//    Log.d("HB", "************** Console logs are VERY useful!");
//    mTextView = findViewById(0);
//    mTextView.setText("This will cause a crash on purpose");
  }

  public void pressedIncrement(View view) {
    mCount++;
    updateView();
  }

  public void pressedReset(View view) {
    mCount = 0;
    updateView();
  }

  public void pressedDecrement(View view) {
    mCount--;
    updateView();
  }

  private void updateView() {
    mTextView.setText(getString(R.string.message_format, mCount));

    // Easter egg
    if (mCount > 10) {
      mTextView.setVisibility(View.INVISIBLE);
    } else {
      mTextView.setVisibility(View.VISIBLE);
    }
  }
}
