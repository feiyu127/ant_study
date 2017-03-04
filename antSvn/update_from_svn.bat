@echo off
set "localDir=%~dp0" 
TortoiseProc.exe /command:checkout  /path %localDir%src/pms_crm /url svn://192.168.1.48/wanglei_dev/trunk/05_Code/pms_admin/src/com