
# Elasticsearch arrayformat plugin

This plugin offers array format for REST search responses.

## Example

    
    curl '0:9200/_search'
    {"took":28,"timed_out":false,"_shards":{"total":5,"successful":5,"failed":0},"hits":{"total":4,"max_score":1.0,"hits":[{"_index":"test","_type":"docs","_id":"3","_score":1.0,"_source":
    {
        "content" : "baz foo"
    }
    },{"_index":"test","_type":"docs","_id":"1","_score":1.0,"_source":
    {
        "content" : "foobar baz"
    }
    },{"_index":"test","_type":"docs","_id":"2","_score":1.0,"_source":
    {
        "content" : "foo baz"
    }
    },{"_index":"test","_type":"docs","_id":"4","_score":1.0,"_source":
    {
        "content" : "foo bazilion"
    }
    }]}}
    
    
    
    curl '0:9200/_search_arrayformat?pretty'
    [ {
      "content" : "baz foo"
    }, {
      "content" : "foobar baz"
    }, {
      "content" : "foo baz"
    }, {
      "content" : "foo bazilion"
    } ]


## Versions

| Elasticsearch version    | Plugin      | Release date |
| ------------------------ | ----------- | -------------|
| 1.4.0                    | 1.4.0.0     | Nov 10, 2014 |
| 1.3.1                    | 1.3.0.0     | Aug  6, 2014 |
| 1.2.1                    | 1.2.1.0     | Jun  5, 2014 |

## Installation

    ./bin/plugin -install arrayformat -url http://xbib.org/repository/org/xbib/elasticsearch/plugin/elasticsearch-arrayformat/1.4.0.0/elasticsearch-arrayformat-1.4.0.0-plugin.zip

Do not forget to restart the node after installing.

## Checksum

| File                                          | SHA1                                     |
| --------------------------------------------- | -----------------------------------------|
| elasticsearch-arrayformat-1.4.0.0.zip         | 36246841e8b8f7a2f075baf1af6ff776a7e838ae |
| elasticsearch-arrayformat-1.3.0.0.zip         | 5100fa4c1e7cc5fb5108856f313a808419720e51 |
| elasticsearch-arrayformat-1.2.1.0.zip         | af3dbaa0e35729ec83d201050808fa035775547c |

## Project docs

The Maven project site is available at [Github](http://jprante.github.io/elasticsearch-arrayformat)

## Issues

All feedback is welcome! If you find issues, please post them at [Github](https://github.com/jprante/elasticsearch-arrayformat/issues)

# License

Elasticsearch Arrayformat Plugin

Copyright (C) 2014 Jörg Prante

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.