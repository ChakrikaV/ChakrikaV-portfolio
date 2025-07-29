# Neural Network Project

This R project applies a neural network model to predict candidate selection outcomes based on preprocessed recruitment data.

## 📁 Files Included

- `Neural Network Project.Rmd`: R Markdown file containing the full analysis and code.
- `Neural-Network-Project.html`: Rendered HTML report.
- `Neural-Network-Project.docx`: Word document version of the report.
- `RecruitmentData_Preprocessed.csv`: Cleaned dataset used for training and testing the model.
- `Neural Network Analysis Report.docx`: Summary report of findings and performance metrics.
- `README.md`: This documentation file.

## ⚙️ What It Does

The goal of this project is to develop and evaluate a neural network model using R to predict whether a candidate will be selected, based on attributes such as experience, scores, and skills. The process involved:

- Trains two neural network models:
  - One with a single hidden layer
  - Another with two hidden layers (2x2)
- Predicts recruitment outcome (0 or 1)
- Evaluates performance using confusion matrices

## 🧠 Tools & Packages Used

- `neuralnet`
- `caret`
- `e1071`

## ▶️ How to Run

1. Make sure you have R and RStudio installed.
2. Install required packages (if not already installed):
   ```r
   install.packages("neuralnet")
   install.packages("caret")
   install.packages("e1071")
   ```
3. Open Neural Network Project.Rmd in RStudio.
4. Load the dataset RecruitmentData_Preprocessed.csv (should be in the same folder).
5. Click Knit to render the report to HTML or Word, or run the chunks manually.
