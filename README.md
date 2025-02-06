# 🎮 High Low - Number Guessing Game

High Low is a simple game where you must guess a random number between **1 and 100** in **10 attempts maximum**.  
The game gives you hints by saying **"Higher"** or **"Lower"** after each guess.

---

## 🚀 Installation and Compilation

### ✅ **Prerequisites**
- **Java 8 or later** must be installed on your machine.  
  Check your Java version with the command:
  ```sh
  java -version
  ```

### 🛠 **Compilation**
1. **Download the source file**
2. **Open a terminal** and navigate to the folder containing the file.
3. **Compile the program with:**
   ```sh
   javac Jeu.java
   ```

### ▶ **Execution**
Once compiled, run the game with:
```sh
java Jeu
```

---

## 🎲 How the Game Works

1. The game randomly selects a **number between 1 and 100**.
2. You have **10 attempts** to guess the number.
3. After each attempt:
   - If your guess is **too low**, the game displays **"Higher!"**.
   - If your guess is **too high**, the game displays **"Lower!"**.
   - If you guess correctly, the game displays **"Congratulations, you found the number!"**.
4. **If you do not find the number after 10 attempts**, the game displays:
   ```
   ***GAME OVER... You failed to find the number in 10 tries***
   ```

---

## 🖥️ Example Usage

```sh
Enter a number: 50
Higher!
Enter a number: 75
Lower!
Enter a number: 62
Higher!
Enter a number: 70
Congratulations, you found the number!
```

---

## 📛 License
This project is licensed under **MIT** – you can modify and distribute it freely.

---

## 👨‍💻 Author
- **Guiougou Nathan (https://github.com/Nathx4)**
- Contact: *guiougou.nathanl@gmail.com*



