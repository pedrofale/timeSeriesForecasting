package weka.classifiers.timeseries.core;

import weka.classifiers.Classifier;

/**
 * An interface for predictors which implement methods for serializing the base model.
 *
 * Created by pedro on 25-08-2016.
 */
public interface BaseModelSerializer extends Classifier {

    /**
     * Serialize model
     *
     * @param path the path to the file to hold the serialized base learner
     * @throws Exception
     */
    void serializeModel(String path) throws Exception;

    /**
     * De-serialize model
     *
     * @param path the path to the file to load the serialized base learner from
     * @throws Exception
     */
    void loadSerializedModel(String path) throws Exception;

}
