

USE test;

SELECT TO_TOROKUBI FROM temptbl GROUP BY TO_TOROKUBI HAVING COUNT(TO_TOROKUBI) = 20150903;