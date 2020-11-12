	DROP TABLE IF EXISTS receipt;
	 
	CREATE TABLE receipt (
	  id INT AUTO_INCREMENT PRIMARY KEY,
	  total INT(255) DEFAULT NULL,
	  date DATE(255) DEFAULT NULL
	);
	 
	INSERT INTO receipt (id, total, date) VALUES
	  ('0', '1500', '2004-12-31');