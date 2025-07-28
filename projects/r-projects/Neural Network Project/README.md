# Neural Network Project

This project uses R and the `neuralnet` package to build and evaluate artificial neural networks that predict student recruitment outcomes based on various input features.

## 📄 Project Files

- `Neural Network Project.Rmd`: Original R Markdown source code
- `Neural-Network-Project.html`: HTML output of the code and analysis
- `Neural-Network-Project.docx`: Word version of the rendered code and output
- `Neural Network Analysis Report.docx`: Summary write-up and insights
- `RecruitmentData_Preprocessed.csv`: Dataset used for training and evaluation

## ⚙️ What It Does

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
