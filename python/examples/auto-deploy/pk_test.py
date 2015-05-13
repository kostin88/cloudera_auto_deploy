import socket, sys, time, ConfigParser, csv, pprint, urllib2
from subprocess import Popen, PIPE, STDOUT
from math import log as ln
from cm_api.api_client import ApiResource
from cm_api.endpoints.services import ApiService
from cm_api.endpoints.services import ApiServiceSetupInfo
from optparse import OptionParser

def main():

    AMON_ROLE_CONFIG = {
   'firehose_heapsize': '1173741824',
}

    API = ApiResource("ec2-52-24-151-222.us-west-2.compute.amazonaws.com", version=5, username="admin", password="admin")
    MANAGER = API.get_cloudera_manager()
    mgmt = MANAGER.get_service()
    #cf = mgmt.get_config()

    for group in mgmt.get_all_role_config_groups():
       if group.roleType == "ACTIVITYMONITOR":
           group.update_config(AMON_ROLE_CONFIG)

    pass

if __name__ == "__main__":
   main()
