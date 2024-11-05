# How to Access and Start the Decision Support Product 

Follow the steps below to properly access and run the product. Make sure you have the necessary tools installed, including **Git**, **Apache Ant**, and a **Java SDK**.
If not, please install them before proceeding.

1. Clone the Repository to Your Local Machine
    - Open your terminal or command-line interface (CLI).
    - To clone the repository to your local machine, run the following command in the terminal:  
      `git clone https://github.com/MetroCS/cs3250_practice.git`
    - This will download the repository to your local system.

1. Navigate into the Repository Directory
    -	Once the repository has been cloned, you need to navigate to the correct directory on your local machine.
    You can do this using the cd command in your terminal:
      `cd cs3250_practice`
    - This command changes your working directory to the cs3250_practice folder.

1. Navigate into the decision_support Directory
    - Now, you need to navigate to the decision_support subdirectory. Enter the following command:
      `cd decision_support`

1. Run the Product Using Apache Ant
    - Once inside the decision_support directory, you will use Apache Ant to build and run the project.
    Enter the following command to execute the product:
      `ant run`
    - The product should now start and be ready for use.

1. Troubleshooting
    - If you encounter any issues, ensure you have Git, Apache Ant, and the Java SDK properly installed.
    You can verify their installations by running:
      `git --version`
      `ant -version`
      `java --version`
    - Additionally, ensure that you are in the correct directory before issuing the `ant run` command. (The file **build.xml** appears in the correct directory.)
