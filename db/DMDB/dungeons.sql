CREATE SEQUENCE dungeon_seq start with 10000;

CREATE TABLE dungeons (
                          dungeon_id bigint NOT NULL DEFAULT nextval('dungeon_seq'),
                          name varchar(50) NOT NULL,
                          theme varchar(50) DEFAULT NULL,
                          type varchar(50) DEFAULT NULL,
                          lore varchar(5000) DEFAULT NULL,
                          description varchar(5000) DEFAULT NULL,
                          location varchar(500) DEFAULT NULL,
                          size varchar(50) DEFAULT NULL,
                          creator varchar(50) DEFAULT NULL,
                          entrance_fee varchar(50) DEFAULT NULL,
                          status varchar(50) DEFAULT NULL,
                          challenge_rating varchar(50) DEFAULT NULL,
                          popularity_rating varchar(50) DEFAULT NULL,
                          source varchar(50) DEFAULT NULL,
--     budget id (1 to 1)
--     rooms (1 to many)
--     employees (1 to many)
--     events (1 to many)
                          PRIMARY KEY (dungeon_id)
);

ALTER SEQUENCE dungeon_seq OWNED BY dungeons.dungeon_id;

INSERT INTO dungeons (dungeon_id, name, theme, type, lore, description, location, size, creator, entrance_fee, status, challenge_rating, popularity_rating, source)
VALUES
(1, 'TEST DUNGEON', 'TEST THEME', 'TEST TYPE', 'TEST LORE', 'TEST DESCRIPTION', 'TEST LOCATION', 'SMALL', 'SMASH', '00.00', 'CLOSED', 'TEST CHALLENGE RATING', 'TEST POPULARITY RATING', 'TEST SOURCE');