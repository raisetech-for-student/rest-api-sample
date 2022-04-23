DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id INT unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  birthdate DATE NOT NULL,
  address VARCHAR(256) NOT NULL,
  PRIMARY KEY(id)
);
INSERT INTO users (name, birthdate, address) VALUES ("小山太郎", "2000-01-01", "兵庫県宝塚市南口");
INSERT INTO users (name, birthdate, address) VALUES ("田中大輔", "2010-01-01", "東京都日本橋小網町");
