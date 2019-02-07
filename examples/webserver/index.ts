// Copyright 2019, Pulumi Corporation.  All rights reserved.

import * as linode from "@pulumi/linode";

let vm = new linode.Instance("vm", {
    region: "us-east",
    type: "g6-nanode-1",
    label: "pulumi_linode",
    image: "linode/debian9",
    tags:  ["pulumi"],
});

export let ip = vm.ipAddress;
