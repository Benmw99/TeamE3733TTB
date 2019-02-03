package Entities;

public enum ApprovalStatus {
    Complete, Incomplete, Incorrect;
}
//1, 2, 3 will be the statuses for approval types
//Ann approval will exist if ApprovalStatus = 1,3 but not 2;