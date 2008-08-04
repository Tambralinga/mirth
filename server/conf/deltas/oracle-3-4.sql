ALTER TABLE PERSON 
ADD 
   (
      FIRSTNAME VARCHAR(40) DEFAULT NULL,
      LASTNAME VARCHAR(40) DEFAULT NULL,
	  ORGANIZATION VARCHAR(255) DEFAULT NULL
   )

ALTER TABLE PERSON DROP COLUMN FULLNAME

ALTER TABLE CHANNEL_STATISTICS ADD ALERTED INTEGER DEFAULT 0
