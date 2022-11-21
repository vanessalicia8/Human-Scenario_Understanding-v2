package com.example.human_scenario_understanding_v2;

import android.content.Context;
import android.content.res.AssetManager;

import org.opencv.objdetect.CascadeClassifier;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.gpu.GpuDelegate;

import java.io.IOException;

public class facialEmotionRecognition {
    private Interpreter interpreter;
    private int INPUT_SIZE;
    private int height=0;
    private int width=0;
    private GpuDelegate gpuDelegate=null;

    private CascadeClassifier cascadeClassifier;
    facialEmotionRecognition(AssetManager assetManager, Context context, String modelPath, int inputSize) throws IOException {

    }

}
