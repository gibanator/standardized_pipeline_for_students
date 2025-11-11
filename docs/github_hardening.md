# Enforce Branch Security
## I. Rules -> Rulesets
1. Create a ruleset
2. Add main branch as a target
<img width="600" height="400" alt="adding main" src="https://github.com/user-attachments/assets/23edc4ce-6bcc-4b1b-a75a-9ec8b36fd5ef" />
<br><br>

3. In Rules - Restrict creations, Restrict updates, Restrict deletions
<img width="600" height="300" alt="restriction" src="https://github.com/user-attachments/assets/3ded6fcf-9049-4270-b07b-337c24fb4f71" />
<br><br>

4. Requre a pull request before merging - **at least 1**
<img width="600" height="500" alt="require pull request" src="https://github.com/user-attachments/assets/ff23ac71-6701-42ca-9cf7-1941e4eb0a35" />
<br><br>

5. Require status checks to pass (gitleaks, Build and test)
<img width="600" height="350" alt="require status checks" src="https://github.com/user-attachments/assets/f7860724-cb5b-463f-8672-527567e13a81" />
<br><br>

6. Block force pushes and Save
<img width="600" height="300" alt="block and save" src="https://github.com/user-attachments/assets/334d5418-48b2-475a-aff9-7711268316ea" />

## II. Advanced Security -> Secret Protection, Push protection
> This will check for secrets for known services
<img width="600" height="700" alt="Protect Secrets" src="https://github.com/user-attachments/assets/7d214062-e7d1-4a82-a323-cff7d060d5d5" />

## III. Other Hardening
1. Don't leave secrets in versioned files - always add them in .gitignore **before** adding file with secrets
```
# EXAMPLE .gitignore
.env
.settings
# add files if necessary
```
2. For better security - use GitHub's **Environments** and **Environmental variables**
   1. Add environment
   <img width="600" height="300" alt="image" src="https://github.com/user-attachments/assets/0715aaec-57dd-42aa-999c-0c6e78dfe109" />
   <br><br>

   2. Add environmental secrets and access them in Actions using `secrets.<secret_name>` syntax
   <img width="600" height="250" alt="image" src="https://github.com/user-attachments/assets/5b9667bd-7625-42d5-8808-829cc364e4cd" />
   <br><br>

3. For local building, use local environmental variables
   - MacOS/Linux
     ```sh  
     # MACOS/LINUX
     # ====== Add for current session =====
     export VAR_NAME="value"
     # ========= Add permanently ==========
     # Add the previous command to:
     ~/.bashrc # for Bash
     ~/.zshrc # for Zsh
     ```
    - Windows
       ```
       # WINDOWS
       # ====== Add for current session =====
       $env:VAR_NAME = "value"
       # ========= Add permanently ==========
       setx VAR_NAME "value"
       # restart PowerShell after thi
       ```
       
4. Gitleaks will notify and its task will fail if it finds leaked passwords   
