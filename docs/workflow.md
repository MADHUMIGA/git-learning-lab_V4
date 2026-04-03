## Workflow Guide

🔹 1. Initial Setup (Everyone)
```
git clone <repo-url>
cd git-learning-lab_V4
```

🔹 2. Switch to Develop Branch
```
git checkout develop
git pull origin develop
```
🔹 3. Create Your Feature Branch
```
Each person creates their own branch:
git checkout -b feature/<your-name>
Example:
feature/madhu
feature/sivi
feature/nithi
feature/kaviya
```
🔹 4. Work and Commit
```
git add .
git commit -m "your changes"
```

🔹 5. Push Your Branch
```
git push -u origin feature/<your-name>
👉 Now your branch exists in GitHub (remote)
```

🔹 6. Create Pull Request (PR)

In GitHub:
feature/<your-name>  →  develop

	• Add title & description
	• Create PR

🔹 7. Review & Merge
```
	• Other team members review
	• One person clicks Merge Pull Request
```
🔹 8. After Merge (VERY IMPORTANT)
```
Everyone must update:
git checkout develop
git pull origin develop
```
🔹 9. Conflict Scenario (IMPORTANT PRACTICE)
```
Step 1:
All members edit SAME file:
src/common/config.txt
Step 2:
Each person changes SAME line
Step 3:
One person merges first
Step 4:
Others run:
git pull origin develop
💥 Conflict happens
```
🔹 10. Resolve Conflict
```
Open file → you will see:
<<<<<<< HEAD
your code
=======
incoming code
>>>>>>> branch
Fix manually → then:
git add .
git commit -m "resolved conflict"
```
🔹 11. Branch Flow (Visual)
```
                feature/madhu
                     ●──●
                    /
develop ───────●────────────●
               \
                ●──●
                feature/kaviya

👉 All feature branches start from develop
👉 Work happens separately
👉 Then merged back into develop
```
## Rotate roles:
```
Round	Person A	     Person B       	Person C	     Person D
1	   Create conflict	 Resolve	        Review PR	     Break repo
2	   Resolve	         Break repo     	Create conflict	 Review
3	   Review	         Create conflict	Resolve          Break

