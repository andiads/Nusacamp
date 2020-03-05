<?php
$nama_partai = $_POST['nama_partai'];
$no_urut = $_POST['no_urut'];
$dapil = $_POST['dapil'];
$nama_istri = $_POST['nama_istri'];
$anak_1 = $_POST['anak_1'];
$anak_2 = $_POST['anak_2'];
$anak_3 = $_POST['anak_3'];
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
       Nama Partai: <?php echo $nama_partai;?><br/>
       No.Urut: <?php echo $no_urut;?><br>
       Dapil: <?php echo $dapil;?><br>
       Istri: <?php echo $nama_istri;?><br>
       Anak ke-1: <?php echo $anak_1;?><br>
       Anak ke-2: <?php echo $anak_2;?><br>
       Anak ke-3: <?php echo $anak_3;?><br>
    </body>
</html>
