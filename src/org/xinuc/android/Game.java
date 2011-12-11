package org.xinuc.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by IntelliJ IDEA.
 * User: xinuc
 * Date: 12/11/11
 * Time: 3:03 AM
 */
public class Game extends Activity {
    private static final String TAG = "Sudoku";

    public static final String KEY_DIFFICULTY = "org.xinuc.android.difficulty";

    public static final int DIFFICULTY_EASY = 0;
    public static final int DIFFICULTY_MEDIUM = 1;
    public static final int DIFFICULTY_HARD = 2;

    private int[] puzzle = new int[9 * 9];

    private PuzzleView puzzleView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");

        int diff = getIntent().getIntExtra(KEY_DIFFICULTY, DIFFICULTY_EASY);
//        this.puzzle = getPuzzle(diff);
//        calculateUsedTiles();

        this.puzzleView = new PuzzleView(this);
        setContentView(puzzleView);
        this.puzzleView.requestFocus();

    }
}