| PJP2.0 weekly assignment |
========================

* Page => https://github.com/mukeshbasira/PJP2.0

1.[WEEK 1](#WEEK-1-BATCH-5)

## WEEK 1 BATCH 5
Assignment - 
[ https://github.com/mukeshbasira/PJP2.0/blob/week1/Assignment%20Question/Week%201%20Assignment.pdf (follow the link given in the pdf)
*command line tasks can be done on local machine itself ]

All changes will be made to newtext.txt , visit the specific branch and read newtext file for more insight.

### week1 will act as master for all these children branches
Commands-
```
git checkout -b week1 master
git checkout -b feature week1
git checkout -b dev week1
git checkout -b qa week1
git checkout -b delivery week1

```
1. Task  - Feature branch to dev promotion
Step 1: From your project repository, bring in the changes and test.
```
git fetch origin
git checkout -b feature origin/feature
```
Step 2: Merge the changes and update on GitHub.
```
git checkout dev
git merge --no-ff feature
git push origin dev
```
2. Task  - handling merge conflicts (dev branch)
Now, Line 4 is added on GitHub in dev branch and new line4 added in local dev branch (in txt file) for conflict.
```
git fetch
```
conflict problem - local dev and origin dev can't be merged
```
git status
cat mytext.txt

```
To resolve a merge conflict is to edit the conflicted file and then merge changes.

3. Task  - Soft and Hard reset (QA branch)
```
git log
git reflog show
git reset --soft 35c8e75
git reset --mixed 35c8e75
git reset --soft 85cff85
git reset --hard 35c8e75 (will delete all changes if any after this commit)
```
4. Task  - Stash local changes during conflicts (feature branch)
```
git stash save
git pull
git stash apply
```
5. Task - rebasing (qa branch -> dev)
```
git checkout dev
git rebase -i qa
```
