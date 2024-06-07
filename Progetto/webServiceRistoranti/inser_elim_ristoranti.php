<?php 
    if(isset($_POST["richiesta"])){
        $conn=new mysqli("localhost","root","","dbRistoranti");
        if($_POST["richiesta"]=="inserisci"){
            $nome=$_POST["nome"];
            if($_POST["sito_web_social"]==""){
                $sito_social=null;
            }else{
                $sito_social=$_POST["sito_web_social"];;
            }
            $tipologia=$_POST["tipologia"];
            $locazione=$_POST["locazione"];
            $telefono=$_POST["telefono"];
            $valutazione=$_POST["valutazione"];
            if($_POST["descrizione"]==""){
                $descrizione=null;
            }else{
                $descrizione=$_POST["descrizione"];
            }
            $cap=$_POST["CAP"];
            $asporto=$_POST["asporto"];
            $con_posto=$_POST["con_posto"];
            $domicilio=$_POST["domicilio"];
            $pranzo=$_POST["pranzo"];
            $cena=$_POST["cena"];
            $wi_fi=$_POST["wi_fi"];
            $toilette=$_POST["toilette"];
            try{
                $out=$conn->query("select * from comuni where CAP=$cap;");
                if($out->num_rows>0){
                    $out=$conn->query("select * from servizi where asporto=$asporto and cons_posto=$con_posto and ser_domicilio=$domicilio and rist_pranzo=$pranzo and rist_cena=$cena and WiFi=$wi_fi and toilette=$toilette;");
                    if($out->num_rows==0){
                        $conn->query("insert into servizi values(null,$asporto,$con_posto,$domicilio,$pranzo,$cena,$wi_fi,$toilette);");
                        $out=$conn->query("select ID_Serv from servizi where asporto=$asporto and cons_posto=$con_posto and ser_domicilio=$domicilio and rist_pranzo=$pranzo and rist_cena=$cena and WiFi=$wi_fi and toilette=$toilette;");
                    }
                    $ris=$out->fetch_array(MYSQLI_ASSOC);
                    $id_serv=$ris["ID_Serv"];
                    if($descrizione==null && $sito_social==null){
                        $conn->query("insert into ristoranti values(null,'$nome',null,'$tipologia','$locazione',$valutazione,$telefono,null,$cap,$id_serv)");
                    }else if($descrizione!=null && $sito_social==null){
                        $conn->query("insert into ristoranti values(null,'$nome',null,'$tipologia','$locazione',$valutazione,$telefono,'$descrizione',$cap,$id_serv)");
                    }else if($descrizione==null && $sito_social!=null){
                        $conn->query("insert into ristoranti values(null,'$nome','$sito_social','$tipologia','$locazione',$valutazione,$telefono,null,$cap,$id_serv)");
                    }else{
                        $conn->query("insert into ristoranti values(null,'$nome','$sito_social','$tipologia','$locazione',$valutazione,$telefono,'$descrizione',$cap,$id_serv)");
                    }
                    echo "Operazione completata";
                }else{
                    $out=$conn->query("select nome from comuni;");
                    $nomi="";
                    while($ris=$out->fetch_array(MYSQLI_ASSOC)){
                        foreach($ris as $key =>$value){
                            if($value=="Zero Branco"){
                                $nomi.="".$value.".";
                            }else{
                                $nomi.="".$value.", ";
                            }
                        }
                    }
                    echo "Errore: il cap del comune desiderato non è attualmente disponibile! "."I comuni disponibili sono: ".$nomi;
                }
            }catch(Exception $e){
                $e->getMessage();
            }
        }else if($_POST["richiesta"]=="elimina"){
            $cod_rist=$_POST["cod_rist"];
            $conn->query("delete from ristoranti where cod_rist=$cod_rist");
            echo "Operazione completata";
        }
    }
?>