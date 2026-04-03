## 📁 Project Structure


```text
git-learning-lab/
│
├── README.md
│
├── solid-principles/        ← your existing code (keep as is)
│   ├── SRP/
│   ├── OCP/
│   ├── LSP/
│   ├── ISP/
│   └── DIP/
│
├── src/                     ← shared files (for conflicts)
│   ├── featureA/
│   │   └── LoginService.java
│   ├── featureB/
│   │   └── PaymentService.java
│   └── common/
│       └── UserService.java       ← 🔥 MAIN conflict file
│
├── practice/                ← personal sandbox
│   ├── kaviya/
│   ├── madhu/
│   ├── nithi/
│   └── sivi/
│
└── docs/                    ← instructions & scenarios
    ├── PracticeScenario.md
    └── structure.md
    └── workflow.md
```
## What each folder is for
```
✅ solid-principles/
	• Keep your existing code 
	• Use it for: 
		○ normal commits 
		○ small feature changes 

✅  src/common/config.txt (MOST IMPORTANT)
👉 This is your conflict generator
    All 4 people will:
	• edit SAME line 
	• create conflicts 

✅ src/featureA, featureB
👉 Used for:
	• branching practice 
	• merging 

✅ practice/<name>/
Each person’s safe area:
👉 Use for:
	• git reset 
	• stash 
	• experiments 
```

