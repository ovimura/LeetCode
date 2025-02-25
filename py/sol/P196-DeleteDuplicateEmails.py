
"""
    DELETE FROM Person WHERE Id NOT IN (
        select mm from (select min(id) as mm
        from Person
        group by email) as aa
    );
"""