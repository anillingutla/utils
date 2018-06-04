
#!groovy
def isValidDeployBranch() {
    branchDetails = getBranchDetails()
    if (branchDetails.type == 'hotfix' || branchDetails.type == 'release') {
        return true
    }
    return false
}

def getBranchDetails() {
    def branchDetails = [:]
    branchData = BRANCH_NAME.split('/')
    if (branchData.size() == 2) {
        branchDetails['type'] = branchData[0]
        branchDetails['version'] = branchData[1]
        return branchDetails
    }
    return branchDetails
}
