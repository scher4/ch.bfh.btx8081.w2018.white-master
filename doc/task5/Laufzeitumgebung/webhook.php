<?php
/*
 dieses file wird von github als webhook benutzt
 und angesprochen. es ruft den create script auf
 der den server "erneuert"
 */
exec("sudo /home/user/create.sh");
echo "sent command";
?>