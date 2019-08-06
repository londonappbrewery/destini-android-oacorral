package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Steps 4 & 8 - Declare member variables here:
    private TextView mStory;
    private Button mOptionTop;
    private Button mOptionBottom;
    private int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mOptionTop = findViewById(R.id.buttonTop);
        mOptionBottom = findViewById(R.id.buttonBottom);

        mStoryIndex = 1;
        mStory.setText(R.string.T1_Story);
        mOptionTop.setText(R.string.T1_Ans1);
        mOptionBottom.setText(R.string.T1_Ans2);


        // Steps 6, 7, & 9 - Set a listener on the top button:
        mOptionTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mStoryIndex) {
                    case 1:
                        mStoryIndex = 3;
                        break;
                    case 2:
                        mStoryIndex = 3;
                        break;
                    case 3:
                        mStoryIndex = 6;
                        break;
                    default:
                        mStoryIndex = 1;
                }
                updateView(mStoryIndex);
            }
        });

        // Steps 6, 7, & 9 - Set a listener on the bottom button:
        mOptionBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mStoryIndex) {
                    case 1:
                        mStoryIndex = 2;
                        break;
                    case 2:
                        mStoryIndex = 4;
                        break;
                    case 3:
                        mStoryIndex = 5;
                        break;
                    default:
                        mStoryIndex = 1;
                }
                updateView(mStoryIndex);
            }
        });

    }


    /**
     *
     * @param storyIndex Index of the story.
     */
    private void updateView(int storyIndex){
        switch(storyIndex) {
            case 2:
                mStory.setText(R.string.T2_Story);
                mOptionTop.setText(R.string.T2_Ans1);
                mOptionBottom.setText(R.string.T2_Ans2);
                break;
            case 3:
                mStory.setText(R.string.T3_Story);
                mOptionTop.setText(R.string.T3_Ans1);
                mOptionBottom.setText(R.string.T3_Ans2);
                break;
            case 4:
                mStory.setText(R.string.T4_End);
                mOptionTop.setVisibility(View.INVISIBLE);
                mOptionBottom.setVisibility(View.INVISIBLE);
                break;
            case 5:
                mStory.setText(R.string.T5_End);
                mOptionTop.setVisibility(View.INVISIBLE);
                mOptionBottom.setVisibility(View.INVISIBLE);
                break;
            case 6:
                mStory.setText(R.string.T6_End);
                mOptionTop.setVisibility(View.INVISIBLE);
                mOptionBottom.setVisibility(View.INVISIBLE);
                break;
            default:
                mStoryIndex = 1;
                mOptionTop.setVisibility(View.INVISIBLE);
                mOptionBottom.setVisibility(View.INVISIBLE);
        }

    }
}
