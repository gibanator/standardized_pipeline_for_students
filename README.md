# Standardized CI/CD Pipeline Template for Students

This repository provides a ready-to-use CI/CD pipeline template for small student projects.  
It demonstrates how to automate build, test, and secure small-scale applications in multiple languages (e.g., Java, Python, Go) using GitHub Actions.

The goal is to encourage consistent, maintainable, and secure workflows, similar to those used in working life in student repositories.

## Features
- Ready-to-use GitHub Actions workflows
- Multi-language support (Java, Python, Go)
- Automated testing, and building scanning
- Secret scanning enabled
- Example environment setup and branch protection guidelines - see `docs/github_hardening`

## Usage
1. Copy this repository.
2. Match `.github/workflows/ci.yml` to your language stack, if needed.
3. Enable required repository settings and precaution (see `docs/github_hardening`):
   - Create `.gitignore` file, and put filenames with secrets in them
   - Secret scanning and push protection
   - Branch protection for `main`
4. Push code to trigger the pipeline and verify CI status checks

## Contributing
If you wish to contribute, pull requests are welcome for improving examples or workflows.
Ensure that:
- No secrets are committed.
- Tests pass locally before opening a PR.
