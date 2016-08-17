/*
 * Copyright (c) 2010 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the GNU Lesser General Public License, Version 2.1. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.gnu.org/licenses/lgpl-2.1.txt. The Original Code is Time Series 
 * Forecasting.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the GNU Lesser Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 */

/*
 *    PrimingDataLearner.java
 *    Copyright (C) 2014 Pentaho Corporation
 */

package weka.classifiers.timeseries;

/**
 * Interface to a forecaster that learns from the priming data
 * 
 * @author Mark Hall (mhall{[at]}pentaho{[dot]}com)
 * @version $Revision: $
 */
public interface PrimingDataLearner {

  /**
   * Reset this forecaster ready to learn from a new set of priming data
   */
  void reset();

  /**
   * Return the minimum number of training/priming data points required before a
   * forecast can be made
   * 
   * @return the minimum number of training/priming data points required
   */
  int getMinRequiredTrainingPoints();

  /**
   * Update the forecaster on a priming instance or predicted value (for
   * closed-loop projection)
   * 
   * @param inst the instance to update from
   */
  void updateForecaster(double primingOrPredictedTargetValue);
}
