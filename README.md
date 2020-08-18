| PJP2.0 weekly assignment |
========================

* Page => https://github.com/mukeshbasira/PJP2.0

1.[WEEK 1](#WEEK-1-BATCH-5)

## WEEK 1 BATCH 5
Assignment - https://github.com/mukeshbasira/PJP2.0/blob/week1/Assignment%20Question/Week%201%20Assignment.pdf

Commands-
```
git checkout -b week1 master
git checkout -b feature week1
git checkout -b dev week1
git checkout -b qa week1
git checkout -b delivery week1

```
Feature branch to dev promotion
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
------------------------------------------------------
now, Line 4 is added on GitHub in dev branch and local have to fetch it.
```
git fetch
```
