<?php 
$host = "localhost";
$user = "root";
$password ="";
$db = "dbRistoranti";


	$conn = new mysqli($host,$user,$password,$db);
	header("Content-Type: application/xml");
	$xml = new SimpleXMLElement('<provinciaTreviso/>');
	$stmRi = $conn->query("select * from ristoranti;");
	while($row = $stmRi->fetch_assoc())
	{
		$user = $xml->addChild('ristorante');
		foreach ($row as $key => $value) 
		{
			if(is_null($value)){
				$user->addChild($key,' ');
			}else{
				if($key=='cod_rist'){
					$user->addAttribute($key, $value);
				}else if($key=='cap'){
					$stmCo=$conn->query("select * from comuni where CAP=$value;");
					while($rowCo = $stmCo->fetch_assoc()){
						$tag_Co=$user->addChild('comune',$rowCo['nome']);
						$tag_Co->addAttribute('CAP',$value);
					}
				}else if($key=='id_serv'){
					$stmSer=$conn->query("select * from servizi where ID_Serv=$value;");
					while($rowSer = $stmSer->fetch_assoc()){
						$tag_Ser=$user->addChild('servizi');
						$tag_Ser->addAttribute($key,$value);
						foreach($rowSer as $keySer=>$valueSer){
							if($keySer!='ID_Serv'){
								if($valueSer==1){
									$valueSer='true';
								}else{
									$valueSer='false';
								}
								$tag_Ser->addChild($keySer,$valueSer);
							}
						}
					}
				}else{
					$user->addChild($key,$value);
				}
			}
		}
	}
	echo $xml->asXML();


?>