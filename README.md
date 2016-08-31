# timeSeriesForecasting

Update: 
Fixed bug that made evaluation for forecasters with base learners which use state be incorrectly performed.
Confidence interval computation and evaluation on training and test data for these kinds of predictors are now fully supported, as opposed to the previous version (1.0.21) in which (as I sadly discovered) only evaluation on training data was working correctly on all cases.
Lots of tests have been made for this version and I'm 99% sure everything is working properly.

Known bugs: 
- confidence interval calculation outputs NaN when all the predictions on the training data have a negative error relative to the actual value. This isn't an issue regarding state dependent predictors -- it will happen on any predictor.
