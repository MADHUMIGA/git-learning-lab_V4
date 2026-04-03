# 🔥 Git Practice Scenarios

This document contains hands-on scenarios to practice Git concepts as a team.

---

## 🧪 Scenario 1: Basic Feature Workflow

### Steps:
1. Switch to develop:
   git checkout develop
   git pull origin develop

2. Create feature branch:
   git checkout -b feature/<your-name>

3. Make changes in:
   src/featureA/LoginService.java

4. Commit:
   git add .
   git commit -m "updated login service"

5. Push:
   git push origin feature/<your-name>

6. Create PR:
   feature/<your-name> → develop

7. Merge PR

---

## ⚔️ Scenario 2: Merge Conflict (IMPORTANT)

### Goal:
Create and resolve a conflict

### Steps:
1. All members edit:
   src/common/UserService.java

2. Modify SAME line:
   return "GENERAL";

3. Each person changes it differently:
   - "IT"
   - "HR"
   - "SALES"
   - "ADMIN"

4. One person merges first

5. Others run:
   git checkout develop
   git pull origin develop

💥 Conflict will occur

---

## 🛠️ Scenario 3: Resolve Conflict

### Steps:
1. Open conflicted file

2. You will see:
```
   <<<<<<< HEAD
   your code
   =======
   incoming code
   >>>>>>> branch
```
3. Fix manually

4. Then:
   git add .
   git commit -m "resolved conflict"

---

## 🔁 Scenario 4: Rebase Practice

### Steps:
1. Create feature branch
2. Make 2–3 commits

3. Run:
   git rebase develop

4. Resolve conflicts if any

---

## 🔀 Scenario 5: Merge vs Rebase

### Try both:

1. Merge:
   git merge develop

2. Rebase:
   git rebase develop

👉 Observe difference using:
   git log --oneline --graph

---

## 📦 Scenario 6: Stash Practice

### Steps:
1. Make changes but DO NOT commit

2. Run:
   ```
   git stash
   ```

4. Switch branch:
   ```
   git checkout develop
   ```

6. Come back:
   ```
   git checkout feature/<name>
   ```

8. Apply stash:
   ```
   git stash pop
   ```

---

## 🔙 Scenario 7: Reset & Revert

### Reset (local undo):
```
   git reset --soft HEAD~1
   git reset --hard HEAD~1
```
### Revert (safe undo):
```
   git revert <commit-id>
```

---

## 🎯 Scenario 8: Cherry Pick

### Steps:
1. Make commit in one branch

2. Switch to another branch

3. Run:
   ```
   git cherry-pick <commit-id>
   ```

---

## 🔍 Scenario 9: Git History

### Commands:
```
   git log
   git log --oneline
   git log --oneline --graph --all
```

---

## 🚨 Scenario 10: Force Push (DANGER)

### Steps:
1. Change commit history:
   ```
   git reset --hard HEAD~1
   ```

3. Push:
   ```
   git push --force
   ```

👉 Observe impact on others

---

# 📚 Important Commands to Practice

## 🔹 Basic Commands
- git clone
- git status
- git add .
- git commit -m "message"
- git push
- git pull

---

## 🔹 Branching
- git branch
- git checkout <branch>
- git checkout -b <branch>
- git branch -d <branch>

---

## 🔹 Merging
- git merge <branch>
- git rebase <branch>

---

## 🔹 Conflict Handling
- git pull (to trigger conflict)
- git add .
- git commit (after resolving)

---

## 🔹 History & Logs
- git log
- git log --oneline
- git log --graph

---

## 🔹 Advanced
- git stash
- git stash pop
- git reset
- git revert
- git cherry-pick
- git push --force

---

# 🔥 Final Goal

Each team member should be able to:

✔ Create branches  
✔ Push and create PR  
✔ Resolve conflicts  
✔ Use rebase and merge  
✔ Undo mistakes using reset/revert  

---

Happy Practicing 🚀
