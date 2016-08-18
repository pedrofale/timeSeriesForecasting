package weka.classifiers.timeseries.core;

import weka.classifiers.Classifier;

/**
 * An interface for state-dependent forecasters. Has methods for clearing, setting and getting
 * previous model state. Useful for forecasters which use models which store state of last prediction
 * to be used in the next prediction.
 *
 * Created by pedrofale on 17-08-2016.
 */
public interface StateDependentPredictor extends Classifier {

    /**
     * Clear/reset state of the model.
     */
    void clearPreviousState();

    /**
     * Load state into model.
     */
    void setPreviousState(Object previousState);

    /**
     * Get the last set state of the model.
     *
     * @return the state of the model to be used in next prediction
     */
    Object getPreviousState();

}
